import React from 'react'
import ReactDOM from 'react-dom/client'
import Header from './components/Header'
import Footer from './components/Footer'
import LoginContent from './components/LoginContent'
import Home from './components/Home'
import './assets/css/index.css'

class Page extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            currentPage: <Home goToLogin = {() => this.goToLogin()}/>
        }
    }
    goToLogin(){
        this.setState({currentPage: <LoginContent/>})
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