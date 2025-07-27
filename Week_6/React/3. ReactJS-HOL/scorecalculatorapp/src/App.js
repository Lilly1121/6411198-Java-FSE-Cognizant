import React from 'react';
import { CalculateScore } from './Components/CalculateScore'; // ✅ Correct path & named import

function App() {
  return (
    <div className="App">
      <CalculateScore
        Name={"Steeve"}
        School={"DNV Public School"}
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
