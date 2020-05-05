import data.FileStore
import data.Repository
import domain.Presenter
import domain.distanceFrom
import io.kotest.matchers.doubles.shouldBeExactly
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import model.UserLocation
import org.junit.Before
import org.junit.Test

class PresenterTest {
    private lateinit var presenter: Presenter
    private val repository: Repository = mockk()
    private val fileStore: FileStore = mockk()

    @Before
    fun setup() {
        presenter = Presenter(repository, fileStore)
    }

    @Test
    fun `test if filtering correctly identifies valid locations`() {
        every { repository.getUserLocations() } returns dummyLocations
        every { fileStore.writeToFile(dummyFilteredLocationResult) } returns Unit
        presenter.compute()
        verify { fileStore.writeToFile(dummyFilteredLocationResult) }
    }

    @Test
    fun `test if distance between two points is computed correctly`() {
        val from = UserLocation(
            50.0,
            0,
            "",
            100.0
        )
        val distance = from
            .distanceFrom(52.0, 100.0)
        distance shouldBeExactly 222.38985328911158
    }
}