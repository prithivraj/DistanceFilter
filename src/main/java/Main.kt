import data.LocalFileStore
import data.NetworkRepository
import domain.Presenter

fun main() {
    val presenter = Presenter(
        repository = NetworkRepository(),
        fileStore = LocalFileStore()
    )
    presenter.compute()
}