import React from 'react'

export default class Armazem extends React.Component{
    render(){
        return(
            <div className='armazem'>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>Quantidade</th>
                        </tr>
                    </thead>
                </table>
            </div>
        )
    }
}