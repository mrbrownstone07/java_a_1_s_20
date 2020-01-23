package app;

interface Stockable {
    public abstract void addStock(int numberOfItemsToBeAdded);
    public abstract void removeStock(int numberOfItemsToBeRemoved);
    public abstract void editStock(int numberOfnewProducts);
}