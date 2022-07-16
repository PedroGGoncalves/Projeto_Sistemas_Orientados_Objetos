export function getTankAspects(tankId){
    const url = '/tanks/'+tankId
    let aspects
    fetch(url)
        .then(resp => resp.json())
        .then(json => {
            aspects = JSON.parse(json)
        })
        
    return new Promise((resolve, reject) => {
        resolve(aspects)
    })
}

export function isAquariumRegistered(){
    const url = '/aquario'
    let status
    fetch(url)
        .then(() => status = true)
        .catch(() => status = false)
    
    return new Promise((resolve, reject) => {
        resolve(status)
        reject(status)
    })
}