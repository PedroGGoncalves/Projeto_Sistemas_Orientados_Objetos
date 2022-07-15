export async function getTankAspects(tankId){
    const url = '/tanks/'+tankId
    let aspects
    await fetch(url)
        .then(resp => resp.json())
        .then(json => {
            aspects = JSON.parse(json)
        })
    return new Promise((resolve, reject) => {
        resolve(aspects)
    })
}