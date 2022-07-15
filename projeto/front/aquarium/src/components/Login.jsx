import React from 'react'
import '../assets/css/login.css'

export default class Login extends React.Component{
    render(){
        return (
            <div className='login'>
                <form action='/login'>
                    <label className='login-label username'>
                        Login:
                        <input type='text' name='login-id' className='login-input-text username'/>
                    </label>   
                    <label className='login-label password'>
                        Senha:
                        <input type='password' name='password' className='login-input-text password'/>
                    </label>
                    <input type='submit' name='login' value='Entrar' className='login-button enter'/>
                    <input type='button' name='register' value='Registrar' className='login-button register' onClick={() => this.props.goToRegister()}/>
                    <a className='login-button exit' href='/'>Sair</a>
                </form>
            </div>
        )
    }
}