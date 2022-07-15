import React from 'react'

export default class CadastrarTanque extends React.Component{
    render(){
        return (
            <div className='a-forms'>
                <form action='/tanque'>
                    <label className='a-forms-label'>
                        Individuos:
                        <input type="number" min='0' name="individuos" className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        pH:
                        <input type="number" min='0' max='14' name="ph" className='a-forms-input-text'/>
                    </label>
                    <label className='a-forms-label'>
                        Salinidade:
                        <input type="number" name="salinidade" className='a-forms-input-text'/>
                        mg/L
                    </label>
                    <label className='a-forms-label'>
                        Oxigenação:
                        <input type="number" name="oxigenacao" className='a-forms-input-text'/>
                        mg/L
                    </label>
                    <label className='a-forms-label'>
                        Horário de Alimentação:
                        <input type="number" name="horario_alimento" className='a-forms-input-text'/>
                        h
                    </label>
                    <label className='a-forms-label'>
                        Filtro:
                        <input type="checkbox" name="filtro"/>
                    </label>
                    <input type='submit' name='register' value='Cadastrar' className='a-forms-button'/>
                    <a className='a-forms-button' href='/'>Sair</a>
                </form>
            </div>
        )
    }
}