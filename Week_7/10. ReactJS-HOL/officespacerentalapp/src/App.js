// src/App.js
import React from 'react';
import officeImg from './assets/office.jpg'; // ✅ Import the image

function App() {
  // JSX heading element
  const heading = <h1 style={{ fontWeight: "bold" }}>Office Space , at Affordable Range</h1>;

  // Office data
  const offices = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
       image: officeImg
    },
   
  ];

  // Helper function to set rent color
  const getRentStyle = (rent) => {
    return {
      color: rent < 60000 ? 'red' : 'green',
      fontWeight: 'bold'
    };
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '20px' }}>
      {heading}

      {offices.map((office, index) => (
        <div key={index} style={{ marginBottom: '40px' }}>
          <img src={office.image} alt={office.name} width="300" height="200" />

          <h2 style={{ fontWeight: "bold" }}>Name: {office.name}</h2>
          <p style={getRentStyle(office.rent)}>Rent: Rs. {office.rent}</p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
