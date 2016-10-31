(function($){
    var location = 'resources/snippets/';
    console.log("loading snippets");
    $(".clojure").each(function(index, element){
        var url = location + $(element).data("snippet");
        $.ajax(url).done(function(data){
            $(element).html(data);
        });
    });
})(jQuery);
