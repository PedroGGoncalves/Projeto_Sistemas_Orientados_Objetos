import React from 'react'
import '../assets/css/login.css'

export default class Login extends React.Component{
    render(){
        return (
            <div className='login'>
                <form>
                    <label htmlFor='username' className='login-label username'>Login:</label>
                    <input type='text' name='username' className='login-input-text username'/>   
                    <label htmlFor='password' className='login-label password'>Senha:</label>
                    <input type='password' className='login-input-text password'/>
                    <a className='login-button exit' href='/'>Sair</a>
                    <input type='submit' name='login' value='Entrar' className='login-button enter'/>
                    <a className='login-button register' href='/'>Registrar</a>
                </form>
            </div>
        )
    }
}