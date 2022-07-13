import React from 'react'
import homeImg from '../assets/img/home.png'
import logoImg from '../assets/img/logo.png'

export default class Header extends React.Component{
    render(){
        return (
            <header>
                <a href='/'>
                    <img className='home' src={homeImg} alt='Home'/>
                </a>
                <span>Aquarium</span>
                <img className='logo' src={logoImg} alt='Logo'></img>
            </header>
        )
    }
}