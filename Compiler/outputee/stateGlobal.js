let mapState;
if (localStorage.getItem("mapState") != null) {
  const storedMap = localStorage.getItem("mapState");
  mapState = new Map(JSON.parse(storedMap ));
}
else{
// if (map != null) {
  mapState = new Map();
  localStorage.setItem("mapState", JSON.stringify(Array.from(mapState)));
}

function setState(key, value) {
  console.log("key: ", key);
  let exist = false;
  mapState.forEach(function (value1, key1) {
    if (key === key1) {
      let ok=false;
      value1.forEach((v ,i)=>{
          if(v==value){
            ok=true;
            return;
          }
      })
      if(!ok){
        value1.push(value);
      }      
      exist = true;
    }
  });
  if (!exist) {
    mapState.set(key, [value]);
  }
  

  const keys = mapState.keys();
  const values = mapState.values();
  console.log("set func :",keys, values,  JSON.stringify(Array.from(mapState)));
  localStorage.setItem("mapState", JSON.stringify(Array.from(mapState)));
}

function getState(key) {
  const storedMap = localStorage.getItem("mapState");
  console.log("storedMap :", storedMap);
  let map1 = new Map(JSON.parse(storedMap || "[]"));
  let arr = [];
  map1.forEach(function (value1, key1) {
    console.log("frome set state valu1 : " ,value1)
    if (key === key1) {
      arr =value1;
      return;
    }
  });
  return arr;
}
