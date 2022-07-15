import React from 'react'
import ReactDOM from 'react-dom/client'
import Header from './components/Header'
import Footer from './components/Footer'
import LoginContent from './components/LoginContent'
import VerTanques from './components/VerTanques'
import Armazem from './components/Armazem'
import Home from './components/Home'
import './assets/css/index.css'

class Page extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            currentPage: <Home 
                goToLogin = {() => this.goToLogin()}
                goToTanques = {() => this.goToTanques()}
                goToArmazem ={() => this.goToArmazem()}
            />
        }
    }
    goToLogin(){
        this.setState({currentPage: <LoginContent/>})
    }
    goToTanques(){
        this.setState({currentPage: <VerTanques/>})
    }
    goToArmazem(){
        this.setState({currentPage: <Armazem/>})
    }
    render(){
        // Alterna a página atual dependendo do item do li clicado
        return (
            <div className='page-start'>
                <Header/>
                {this.state.currentPage}
                <Footer/>
            </div>
        )
    }
}

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(<Page/>)