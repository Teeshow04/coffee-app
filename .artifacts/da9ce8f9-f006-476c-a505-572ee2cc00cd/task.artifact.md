# Task List - Fix Product List and API Integration

- [x] Modify `ApiService.kt` to support pagination parameters (`skip`, `limit`)
- [x] Update `ProductPagingSource.kt` to pass paging parameters to the API
- [x] Update `ProductListScreen.kt` with loading/error states and proper `LazyPagingItems` usage
- [x] Add `Modifier.fillMaxSize()` in `MainActivity.kt`
- [x] Verify build and manual check via logs/UI
- [x] Create `MockData.kt` with sample products
- [x] Implement fallback logic in `ApiService.kt`
