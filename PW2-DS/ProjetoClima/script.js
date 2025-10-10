document.querySelector('.busca').addEventListener('submit', async(event)=>{
    event.preventDefault()

    let input = document.querySelector('#searchIput').value

    if(input !== ""){
        showWarning("Carregando...")

        let url = `https://api.openweathermap.org/data/2.5/weather?q=${ encodeURI(input) }
        &appid=c5fcf739214f8c7a5f4e9bfa6db11199&units=metrics&lang=pt_br`

        let result = await fetch(url)
        let json   = await result.json

        console.log(json)
    }else{

    }
})

function showWarning(msg){
    document.querySelector('.aviso').innerHTML = msg
}