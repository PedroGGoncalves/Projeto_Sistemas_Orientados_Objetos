import React from 'react'
import '../assets/css/home.css'

export default class Home extends React.Component{
    render(){
        return (
            <div>
                <nav>
                    <ul className='pages-list'>
                        <li id='redirect-login' onClick={this.props.goToLogin}>Login</li>
                        <li id='redirect-tanks' onClick={this.props.goToTanques}>Ver Tanques</li>
                        <li id='redirect-warehouse' onClick={this.props.goToArmazem}>Ver Armazem</li>
                        <li id='redirect-species'>Ver Espécies</li>
                    </ul>
                </nav>
            </div>
        )    
    }
}