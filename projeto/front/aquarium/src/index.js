import React from 'react'
import ReactDOM from 'react-dom/client'
import Header from './components/Header'
import LoginContent from './components/LoginContent'
import './assets/css/index.css'

class Page extends React.Component{
    render(){
        return (
            <div>
                <Header/>
                <LoginContent/>
            </div>
        )
    }
}

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(<Page/>)