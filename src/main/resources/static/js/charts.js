document.addEventListener('DOMContentLoaded', function () {
  var ctx = document.getElementById('portfolioPieChart').getContext('2d');
  var assetPieChart = new Chart(ctx, {
    type: 'pie',
    data: {
      labels: ['주식', '채권', '부동산', '현금'],
      datasets: [{
        data: [/*[[${stocks}]], [[${bonds}]], [[${realEstate}]], [[${cash}]]*/], // 서버에서 전달된 데이터 사용
        backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56', '#4BC0C0']
      }]
    },
    options: {
      responsive: true
    }
  });
});
