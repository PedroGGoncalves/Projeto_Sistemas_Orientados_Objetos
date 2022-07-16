import React from 'react'

export default class CadastrarAquario extends React.Component{
    render(){
        return (
            <div className='a-forms'>
                <form action='/aquario'>
                    <label className='a-forms-label'>
                        Nome:
                        <input type="text" name="aquarioNome" className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Endereço:
                        <input type="text" name="aquarioEndereco" className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Horário de Funcionamento:
                        <input type="text" name="aquarioHorario" className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Contato:
                        <input type="text" name="aquarioContato" className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Preço do Ingresso:
                        <input type="number" min='0' name="precoIngresso" className='a-forms-input-text'/>
                    </label>
                    <input type='submit' name='cadastrarAquario' value='Cadastrar' className='a-forms-button'/>
                    <a className='a-forms-button' href='/'>Sair</a>
                </form>
            </div>
        )
    }
}