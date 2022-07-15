import React from 'react'
import '../assets/css/forms.css'

export default class Login extends React.Component{
    render(){
        return (
            <div className='a-forms'>
                <form action='/login'>
                    <label className='a-forms-label username'>
                        Login:
                        <input type='text' name='login-id' className='a-forms-input-text username'/>
                    </label>   
                    <label className='a-forms-label password'>
                        Senha:
                        <input type='password' name='password' className='a-forms-input-text password'/>
                    </label>
                    <input type='submit' name='login' value='Entrar' className='a-forms-button enter'/>
                    <input type='button' name='register' value='Registrar' className='a-forms-button register' onClick={() => this.props.goToCadastro()}/>
                    <a className='a-forms-button exit' href='/'>Sair</a>
                </form>
            </div>
        )
    }
}