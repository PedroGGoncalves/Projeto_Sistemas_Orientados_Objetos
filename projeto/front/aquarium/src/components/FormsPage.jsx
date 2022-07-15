import React from 'react'
import aquariumImg from '../assets/img/aquario.jpg'
import '../assets/css/formsPage.css'

export default class LoginContent extends React.Component{
    render(){
        return (
            <div className='forms-page'>
                {this.props.page}
                <div className='decor'>
                    <img src={aquariumImg} alt='Decoração Aquário'></img>
                </div>
            </div>
        )
    }
}