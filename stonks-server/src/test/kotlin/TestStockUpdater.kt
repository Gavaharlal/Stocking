import stocks.StockStorage
import stocks.StockUpdater

class TestStockUpdater(stockStorage: StockStorage) : StockUpdater(stockStorage) {
    override val updateTimeoutMs = 0L
    override val updateDeltas: DoubleArray = doubleArrayOf(1.0)
}
