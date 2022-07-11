import React from 'react'
import Login from './Login'
import aquariumImg from '../assets/img/aquario.jpg'
import '../assets/css/login.css'

export default class Home extends React.Component{
    render(){
        return (
            <div className='home'>
                <Login/>
                <div className='decor'>
                    <img src={aquariumImg} alt='Decoração Aquário'></img>
                </div>
            </div>
        )
    }
}