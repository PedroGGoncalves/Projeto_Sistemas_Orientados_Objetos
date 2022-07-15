import React from 'react'
import Login from './Login'
import Register from './Register'
import aquariumImg from '../assets/img/aquario.jpg'
import '../assets/css/login-content.css'

export default class LoginContent extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            currentComponent: <Login goToRegister={() => this.goToRegister()}/>
        }
    }
    goToRegister(){
        this.setState({currentComponent: <Register/>})
    }
    render(){
        return (
            <div className='login-content'>
                {this.state.currentComponent}
                <div className='decor'>
                    <img src={aquariumImg} alt='Decoração Aquário'></img>
                </div>
            </div>
        )
    }
}