import React from 'react';

const Scorebelow70 = ({ players }) => {
  const filtered = players.filter(player => player.score < 70); // arrow function

  return (
    <ul>
      {filtered.map((p, i) => (
        <li key={i}>{p.name} {p.score}</li>
      ))}
    </ul>
  );
};

export default Scorebelow70;
