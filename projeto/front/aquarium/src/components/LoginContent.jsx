import React from 'react'
import Login from './Login'
import aquariumImg from '../assets/img/aquario.jpg'
import '../assets/css/login-content.css'

export default class LoginContent extends React.Component{
    render(){
        return (
            <div className='login-content'>
                <Login/>
                <div className='decor'>
                    <img src={aquariumImg} alt='Decoração Aquário'></img>
                </div>
            </div>
        )
    }
}