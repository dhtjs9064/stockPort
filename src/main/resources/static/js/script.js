document.addEventListener("DOMContentLoaded", function() {

    const deleteButtons = document.querySelectorAll(".btn-danger");

    deleteButtons.forEach(button => {
        button.addEventListener("click", function(event) {
            const confirmation = confirm("Are you sure you want to delete this item?");
            if (!confirmation) {
                event.preventDefault();
            }
        });
    });

    console.log("Dashboard loaded successfully!");
});
