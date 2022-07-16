import React from 'react'
import { getTicketPrice } from '../resources'

export default class Ingresso extends React.Component{
    constructor(props){
        super(props)
        this.state = {valor: '??'}
    }
    componentDidMount(){
        let getPreco = async () => {
            let valor = await getTicketPrice()
            if(valor !== null)
                this.setState({valor})
        }
        getPreco()
    }
    render(){
        return (
            <div class='a-forms'>
                <span className='a-forms-info'>Preço atual do ingresso: R${this.state.valor}</span>
                <form action='/aquario'>
                    <label className='a-forms-label'>
                        Novo Preço:
                        <input type="number" min='0' name="precoIngresso" className='a-forms-input-text'/>
                    </label>
                    <input type='submit' name='changePrice' value='Alterar' className='a-forms-button'/>
                    <a className='a-forms-button' href='/'>Sair</a>
                </form>
            </div>
        )
    }
}