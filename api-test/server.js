const express = require("express");
const app = express();

const PORT = process.env.PORT || 8060;

app.use(express.static(__dirname + "/dist/api-test"));

app.get("/*", (req, res) => {
  res.sendFile(__dirname + "/dist/api-test/index.html");
});

app.listen(PORT, () => {
  console.log("Servidor iniciando na porta " + PORT);
});
