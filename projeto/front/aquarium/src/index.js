import React from 'react'
import ReactDOM from 'react-dom/client'
import Header from './components/Header'
import Home from './components/Home'
import './assets/css/index.css'

class Page extends React.Component{
    render(){
        return (
            <div>
                <Header/>
                <Home/>
            </div>
        )
    }
}

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(<Page/>)