import React from 'react'
import VideoControler from './utils/videoControler'
import {getTankAspects} from '../resources'
import '../assets/css/verTanques.css'

export default class VerTanques extends React.Component{
    constructor(props){
        super(props)
        this.videosCon = new VideoControler()
        this.state = { 
            currentTank: this.videosCon.getCurrentVideo(),
            tankId: this.videosCon.i + 1,
            waterAspects: {
                ph: '---',
                temp: '---',
                o2: '---',
                salt: '---',
            }
        }
    }
    /** Preenche os aspectos (pH, temperatura, etc) assim que carregá-las do servidor */
    componentDidMount(){
        getTankAspects(0).then(aspects => this.fillWaterAspects(aspects))
    }
    fillWaterAspects(aspects){
        if(aspects !== undefined)
            this.setState({waterAspects: aspects})
    }
    /** Avança para o próximo tanque (se existente) */
    next(){
        this.setState({
            currentTank: this.videosCon.getNextVideo(),
            tankId: this.videosCon.i + 1
        })
        getTankAspects(this.videosCon.i).then(aspects => this.fillWaterAspects(aspects))
    }
    /** Volta para o tanque anterior (se existente) */
    previous(){
        this.setState({
            currentTank: this.videosCon.getPreviousVideo(),
            tankId: this.videosCon.i + 1
        })
        getTankAspects(this.videosCon.i).then(aspects => this.fillWaterAspects(aspects))
    }
    render(){
        return (
            <div className='ver-tanques'>
                <div className='tanque-id'>
                    <h1>
                        Tanque {this.state.tankId}
                    </h1>
                </div>
                <div className='tanque-content'>
                    <div className='tanque-right'>
                        <div className='setas-e-video'>
                            <div className='arrow' onClick={() => this.previous()}>
                                {"<"}
                            </div>
                            <iframe width="625" height="352" src={this.state.currentTank.src} title={this.state.currentTank.title} frameBorder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"></iframe>
                            <div className='arrow' onClick={() => this.next()}>
                                {">"}
                            </div>
                        </div>
                        <div className='tanque-info'>
                            <Aspects waterAspects={this.state.waterAspects}/>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}
function Aspects(props){
    return(
        <table>
            <thead>
                <tr>
                    <th>pH</th>
                    <th>Temperatura</th>
                    <th>Oxigenação</th>
                    <th>Salinidade</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>{props.waterAspects.ph}</td>
                    <td>{props.waterAspects.temp}</td>
                    <td>{props.waterAspects.o2}</td>
                    <td>{props.waterAspects.salt}</td>
                </tr>
            </tbody>
        </table>
    )
}