export async function getTankAspects(tankId){
    const url = '/tanks/'+tankId
    let aspects, success
    try{
        const resp = await fetch(url)
        aspects = JSON.parse(resp.json())
        success = resp.ok  // Se a requisição falhar, success = false
    }
    catch{
        success = false
    }
        
    return new Promise((resolve, reject) => {
        if(success)
            resolve(aspects)
        else
            reject()
    })
}

export async function isAquariumRegistered(){
    const url = '/aquario'
    let status
    try{
        const resp = await fetch(url)
        status = resp.ok
    }
    catch{
        status = false
    }

    return new Promise((resolve) => resolve(status))
}

export async function getTicketPrice(){
    const url = '/aquario/0'
    let price
    try{
        const resp = await fetch(url)
        price = JSON.parse(resp.json()).precoIngresso
    }
    catch{
        price = null
    }

    return new Promise((resolve) => resolve(price))
}