db.createUser(
    {
        user: "api-event-planner",
        pwd: "password",
        roles: [
            {
                role: "readWrite",
                db: "api-event-planner-db"
            }
        ]
    }
)