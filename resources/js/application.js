(function($, Elm){
    $.deck('.slide');
    $(".clojure").load_snippets();

    var node = $('#plain-brainbow')[0];
    Elm.Brainbow.embed(node);
})(jQuery, Elm);
