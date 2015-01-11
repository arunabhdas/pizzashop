<div class="product">
    <div><h3>
        <button id="showDetailLink">${product.name}</button></h3></div>
    <h4>${product.name}</h4>

    <p>${product.description}</p>

    <div class="price">Price : "${product.price}"</div>

    <div class="detail" id="${product.id}">${product.id}</div>
    <g:javascript>
    $('#showDetailLink').click(function() {
        $.ajax({
            url: "${createLink(controller: 'product', action: 'ajaxdetail' )}",
            context: document.body,
            success: function(data) {
                // Display user bar
                $('.detail').css( "border", "3px solid red" ).add("<p id='new'>Testing</p>");
        }
        });
        });
    </g:javascript>

</div>
