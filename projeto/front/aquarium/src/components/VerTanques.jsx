import React from 'react'
import '../assets/css/verTanques.css'

export default class VerTanques extends React.Component{
    videos = [
        {
            src: 'https://www.youtube.com/embed/XVkADAwOXnU',
            title: 'Aquario 1'
        },
        {
            src: 'https://www.youtube.com/embed/75lhLxl6DW4',
            title: 'Aquario 2'
        },
        {
            src: 'https://www.youtube.com/embed/iesgrvt2ngw',
            title: 'Aquario 3'
        },
    ]
    videoIndex = 0
    constructor(props){
        super(props)
        this.state = { 
            currentVideo: {
                src: 'https://www.youtube.com/embed/XVkADAwOXnU',
                title: 'Aquario 1'
            }
        }
    }
    nextVideo(){
        if(this.videoIndex + 1 < this.videos.length)
            this.setState({currentVideo: this.videos[++this.videoIndex]})
    }
    previousVideo(){
        if(this.videoIndex - 1 >= 0)
            this.setState({currentVideo: this.videos[--this.videoIndex]})
    }
    render(){
        return (
            <div className='ver-tanques'>
                <h2>
                    Tanque 01
                </h2>
                <div className='tanque'>
                    <div className='left-arrow arrow' onClick={() => this.previousVideo()}>{"<"}</div>
                    <iframe width="625" height="352" src={this.state.currentVideo.src} title={this.state.currentVideo.title} frameBorder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"></iframe>
                    <div className='right-arrow arrow' onClick={() => this.nextVideo()}>{">"}</div>
                </div>
                <div className='tanques-bot'>
                    <table>
                        <tr>
                            <th>pH</th>
                            <th>Temperatura</th>
                            <th>Oxigenação</th>
                            <th>Salinidade</th>
                        </tr>
                        <tr>
                            <td>7</td>
                            <td>28ºC</td>
                            <td>1g/L</td>
                            <td>1g/L</td>
                        </tr>
                    </table>
                    <div className='botao-ver-detalhes'>
                        Ver Detalhes
                    </div>
                </div>
            </div>
        )
    }
}