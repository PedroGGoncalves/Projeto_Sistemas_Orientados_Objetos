import React from 'react'

export default class Footer extends React.Component{
    render(){
        return (
            <footer>
                <div className='authors-div'>
                    <span>Criado por:</span>
                    <ul className='authors-list'>
                        <li>Lucas B. Spagnol</li>
                        <li>Lucas H. Mondini</li>
                    </ul>
                    <ul className='authors-list'>
                        <li>Pedro G. Gonçalves</li>
                        <li>Vinicius A. Brunheroto</li>
                    </ul>
                    
                </div>
                <div className='unesp'>
                    Unesp 2022
                </div>
            </footer>
        )
    }
}