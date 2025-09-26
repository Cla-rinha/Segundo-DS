document.querySelector('.busca').addEventListener('submit', (event)=>{
    event.preventDefault()

    let input = document.querySelector('#searchIput').value

    if(Input !== ""){
        showWarning("Carregando...")
    }else{

    }
})

function showWarning(msg){
    document.querySelector('.aviso').innerHTML = msg
}