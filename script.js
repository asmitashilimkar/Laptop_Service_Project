// ---------------- SERVICE REQUEST FORM ----------------
document.getElementById("serviceForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const data = {
    customerName: document.getElementById("name").value,
    phone: document.getElementById("phone").value,
    email: document.getElementById("email").value,
    serviceType: document.getElementById("serviceType").value,
    description: document.getElementById("description").value
  };

  fetch("http://localhost:8080/api/service/request", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(data)
  })
    .then(res => res.json())
    .then(() => {
      document.getElementById("msg").innerText = "✅ Request submitted successfully!";
      document.getElementById("serviceForm").reset();
    })
    .catch(() => {
      document.getElementById("msg").innerText = "❌ Error submitting request";
    });
});


// ---------------- LOAD REVIEWS ----------------
function loadReviews() {
  fetch("http://localhost:8080/api/reviews")
    .then(res => res.json())
    .then(data => {
      const list = document.getElementById("reviewList");
      list.innerHTML = "";
      data.forEach(r => {
        list.innerHTML += `
          <div style="background:#f4f6f8; padding:10px; margin:10px 0; border-radius:8px">
            <b>${r.name}</b> - ${"⭐".repeat(r.rating)}
            <p>${r.message}</p>
          </div>
        `;
      });
    });
}

loadReviews();


// ---------------- SUBMIT REVIEW ----------------
document.getElementById("reviewForm").addEventListener("submit", function(e) {
  e.preventDefault();

  const data = {
    name: document.getElementById("rname").value,
    message: document.getElementById("rmsg").value,
    rating: document.getElementById("rating").value
  };

  fetch("http://localhost:8080/api/reviews", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(data)
  })
  .then(() => {
    document.getElementById("reviewForm").reset();
    loadReviews();
  });
});
