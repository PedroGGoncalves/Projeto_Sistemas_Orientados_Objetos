export function getTankAspects(tankId){
    const url = '/tanks/'+tankId
    let aspects
    let fail = false
    fetch(url)
        .then(resp => resp.json())
        .then(json => aspects = JSON.parse(json))
        .catch(() => fail = true)
        
    return new Promise((resolve, reject) => {
        if(!fail)
            resolve(aspects)
        else
            reject()
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