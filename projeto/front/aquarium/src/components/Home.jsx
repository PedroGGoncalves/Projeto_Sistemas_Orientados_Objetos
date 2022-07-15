import React from 'react'
import '../assets/css/home.css'

export default class Home extends React.Component{
    render(){
        return (
            <div>
                <nav>
                    <ul className='pages-list'>
                        <li onClick={this.props.goToLogin}>Login</li>
                        <li onClick={this.props.goToVerTanques}>Ver Tanques</li>
                        <li onClick={this.props.goToCadastrarTanque}>Cadastrar Tanque</li>
                        <li onClick={this.props.goToArmazem}>Ver Armazem</li>
                    </ul>
                </nav>
            </div>
        )    
    }
}