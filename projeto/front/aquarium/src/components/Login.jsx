import React from 'react'

export default class Login extends React.Component{
    render(){
        return (
            <div className='login'>
                <form>
                    <div className='usr-form'>
                        <label htmlFor='username'>Login:</label>
                        <input type='text' name='username'/>
                    </div>
                    <div className='pwd-form'>    
                        <label htmlFor='password'>Senha:</label>
                        <input type='password'/>
                    </div>
                    <a className='bt-sair' href='/'>Sair</a>
                    <input type='submit' name='login' value='Entrar' className='bt-entrar'/>
                    <a className='bt-registrar' href='/'>Registrar</a>
                </form>
            </div>
        )
    }
}