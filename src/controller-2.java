    @ResponseBody
    @RequestMapping(value = "/api/order",
                    method = RequestMethod.POST,
                    consumes = "application/json")
    public Order createOrder(@RequestBody Order order) {
        …
        webSocketManager.broadcast("order", "added", order);
    }

    …
}
