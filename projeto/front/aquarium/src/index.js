import React from 'react'
import ReactDOM from 'react-dom/client'
import Header from './components/Header'
import Footer from './components/Footer'
import FormsPage from './components/FormsPage'
import Login from './components/Login'
import Cadastro from './components/Cadastro'
import VerTanques from './components/VerTanques'
import Armazem from './components/Armazem'
import CadastrarTanque from './components/CadastrarTanque'
import Home from './components/Home'
import './assets/css/index.css'

class Page extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            currentPage: <Home 
                goToLogin = {() => this.goToLogin()}
                goToVerTanques = {() => this.goToVerTanques()}
                goToArmazem ={() => this.goToArmazem()}
                goToCadastrarTanque = {() => this.goToCadastrarTanque()}
            />
        }
    }
    goToLogin(){
        this.setState({currentPage: <FormsPage page={
            <Login goToCadastro={() => this.goToCadastro()}/>
        }/>})
    }
    goToCadastro(){
        this.setState({currentPage: <FormsPage page={<Cadastro/>}/>})
    }
    goToVerTanques(){
        this.setState({currentPage: <VerTanques/>})
    }
    goToCadastrarTanque(){
        this.setState({currentPage: <FormsPage page={<CadastrarTanque/>}/>})
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