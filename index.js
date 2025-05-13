const express = require('express');
const app = express();
app.use(express.json());

app.get('/users', (req, res) => {
  res.json([{ id: 1, name: "Alice" }]);
});

app.listen(3000, () => {
  console.log('Server running on http://localhost:3000');
});

