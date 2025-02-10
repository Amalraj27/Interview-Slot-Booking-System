function enrolledperson()
{
  fetch("http://localhost:8080/enrolled").
  then((response) => response.json()).
  then((enroll) => {
    const data = document.getElementById("enrolledpeople")

    enroll.forEach(element => {
      var row = `<tr>
        <td>${element.name}</td>
        <td>${element.email_id}</td>
        <td>${element.phone_no}</td>
        <td>${element.roles}</td>
        <td>${element.timing}</td>
      </tr>`

      data.innerHTML+=row;
    });
  });
}

function availableinterview(){
  fetch("http://localhost:8080/availableinterview").
  then((response) => response.json()).then((available) =>{
    const avaidata = document.getElementById("availableinterview")

    available.forEach(ele => {
      var rows = `<tr>
      <td>${ele.interviewer_name}</td>
      <td>${ele.interviewer_email_id}</td>
      <td>${ele.interviewer_phone_number}</td>
      <td>${ele.roles}</td>
      </tr>`

      avaidata.innerHTML+=rows;
    });
  });
}