<%@include file="head.jsp"%>

<html>
<body>
<div class="container">
    <%@include file="nav.jsp"%>
    <h2 class="text-center">Quiz Builder App</h2>

<%--    Add buttons for search--%>
    <form action="searchUser" class="form-inline">
        <div class="form-group p-1">
            <label for="searchTerm" class="m-1 p-1">Search</label>
            <input type="text" class="form-control" id="searchTerm" name="searchTerm"
                   aria-describedby="searchTermHelp" placeholder="Enter last name">
        </div>
        <button type="submit" name="submit" value="search" class="btn btn-primary m-2">Search</button>
        <button type="submit" name="submit" value="viewAll" class="btn btn-primary m-2">View all users</button>
    </form>
    <hr>
    <%--    Left side "welcome" --%>
    <%--    Right side card, sample quiz or featured quiz --%>
    <div class="row">
        <div class="col-8">
            <h3>Welcome to Quiz Builder</h3>
            <p>Bacon ipsum dolor amet ball tip eu buffalo turkey laborum, cow ad tempor chislic shoulder aute mollit jerky.
                Pig meatloaf sed aliqua labore officia. Short loin landjaeger lorem et, aute ut ad anim.
                Duis non cow ham tempor chicken aute cupim ipsum eiusmod. Fugiat meatball brisket quis tenderloin t-bone nulla, consectetur beef.</p>
        </div>
        <div class="col-4">
            <div class="card bg-primary">
                <div class="card-body bg-light">
                    <h3>Featured (Pirate) Quiz!</h3>
                    <p>Bilge rat ballast swab galleon lookout furl hornswaggle Privateer hardtack bucko.
                        Scourge of the seven seas grog bring a spring upon her cable transom measured fer
                        yer chains clipper Shiver me timbers tackle bilge rat belay.</p>


                </div>
            </div>
        </div>
    </div>

</div>

</body>
</html>