import React from 'react'
import '../assets/css/forms.css'

export default class Cadastro extends React.Component{
    render(){
        return (
            <div className='a-forms'>
                <form action='/funcionario'>
                    <label className='a-forms-label'>
                        Login:
                        <input type='text' name='login-id' className='a-forms-input-text'/>   
                    </label>
                    <label className='a-forms-label'>
                        Senha:
                        <input type='password' name='password' className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Nome Completo:
                        <input type='text' name='fullname' className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        RG:
                        <input type='text' name='rg' className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        CPF:
                        <input type='text' name='cpf' className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Salário:
                        <input type='number' min='0' name='salario' className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Data de Nascimento:
                        <input type='date' name='birthdate' className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Data de Contratação:
                        <input type='date' name='hiredate' className='a-forms-input-text'/>
                    </label>
                    <Funcionarios/>
                    <input type='submit' name='register' value='Cadastrar' className='a-forms-button'/>
                    <a className='a-forms-button' href='/'>Sair</a>
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