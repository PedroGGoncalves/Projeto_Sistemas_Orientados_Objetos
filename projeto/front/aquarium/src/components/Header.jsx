import React from 'react'
import logoImg from '../assets/img/home.png'

export default class Header extends React.Component{
    render(){
        return (
            <header>
                <a href='/'>
                    <img className='logo' src={logoImg} alt='logo'/>
                </a>
                <span>Aquarium</span>
            </header>
        )
    }
}