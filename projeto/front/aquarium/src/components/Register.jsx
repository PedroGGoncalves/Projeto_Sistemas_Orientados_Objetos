import React from 'react'
import '../assets/css/login.css'

export default class Login extends React.Component{
    render(){
        return (
            <div className='login'>
                <form action='/funcionario'>
                    <label className='login-label'>
                        Login:
                        <input type='text' name='login-id' className='login-input-text'/>   
                    </label>
                    <label className='login-label'>
                        Senha:
                        <input type='password' name='password' className='login-input-text'/>
                    </label>
                    <label className='login-label'>
                        Nome Completo:
                        <input type='text' name='fullname' className='login-input-text'/>
                    </label>
                    <label className='login-label'>
                        RG:
                        <input type='text' name='rg' className='login-input-text'/>
                    </label>
                    <label className='login-label'>
                        CPF:
                        <input type='text' name='cpf' className='login-input-text'/>
                    </label>
                    <label className='login-label'>
                        Salário:
                        <input type='number' min='0' name='salario' className='login-input-text'/>
                    </label>
                    <label className='login-label'>
                        Data de Nascimento:
                        <input type='date' name='birthdate' className='login-input-text'/>
                    </label>
                    <label className='login-label'>
                        Data de Contratação:
                        <input type='date' name='hiredate' className='login-input-text'/>
                    </label>
                    <Funcionarios/>
                    <input type='submit' name='register' value='Cadastrar' className='login-button'/>
                    <a className='login-button' href='/'>Sair</a>
                </form>
            </div>
        )
    }
}
class Funcionarios extends React.Component{
    render(){
        return (
            <div className='radio-funcao'>
                <label htmlFor='radio' className='radio-label'>Bilheteiro:</label>
                <input type='radio' name='funcao' value='bilheteiro'/>
                <label htmlFor='radio' className='radio-label'>Segurança:</label>
                <input type='radio' name='funcao' value='seguranca'/>
                <label htmlFor='radio' className='radio-label'>Veterinário:</label>
                <input type='radio' name='funcao' value='veterinario'/>
                <label htmlFor='radio' className='radio-label'>Limpeza:</label>
                <input type='radio' name='funcao' value='limpeza'/>
                <label htmlFor='radio' className='radio-label'>Administrador:</label>
                <input type='radio' name='funcao' value='adm'/>
            </div>
        )
    }
}