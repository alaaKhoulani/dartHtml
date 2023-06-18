let map;
if (localStorage.getItem("map") != null) {
  const storedMap = localStorage.getItem("map");
  map = new Map(JSON.parse(storedMap ));
}
else{
// if (map != null) {
  map = new Map();
  localStorage.setItem("map", JSON.stringify(Array.from(map)));
}

function setData(key, value) {
  console.log("key: ", key, value);
  let exist = false;
  map.forEach(function (value1, key1) {
    if (key === key1) {
      console.log("keyyyyyyyyyyyy: ", key, value);
      map.delete(key);
      console.log("valllllllllll", value1);
      exist = true;
    }
  });
  // if (!exist) {
  map.set(key, value);
  // }

  localStorage.setItem("map", JSON.stringify(Array.from(map)));
  console.log("set func :", localStorage.getItem("map"));
}
  localStorage.setItem("map", JSON.stringify(Array.from(map)));
  console.log("set func :", localStorage.getItem("map"));


function getData(key) {
  const storedMap = localStorage.getItem("map");
  console.log("storedMap :", storedMap);
  let map1 = new Map(JSON.parse(storedMap || "[]"));
  let arr = [];
  map1.forEach(function (value1, key1) {
    if (key === key1) {
      arr = value1;
      return;
    }
  });
  return arr;
}
