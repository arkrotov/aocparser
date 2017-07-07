document.addEventListener('DOMContentLoaded', function() {
    var checkPageButton = document.getElementById('checkPage');
    checkPageButton.addEventListener('click', function() { 
       // chrome.tabs.getSelected(null, function(tab) {
            console.log('asd');
			
			console.log(document);
			chrome.tabs.executeScript(null, {file : 'q.js'});
			/*
			var target = document.querySelector('.task-list');
 
            // создаем экземпляр наблюдателя
            var observer = new MutationObserver(function(mutations) {
            mutations.forEach(function(mutation) {
            console.log(mutation.type);
		    console.log('QQ');
            });    
            });
 
            // настраиваем наблюдатель
            var config = { attributes: true, childList: true, characterData: true }
  
            // передаем элемент и настройки в наблюдатель
            observer.observe(target, config);
			*/
			
       // });
    }, false);
}, false);