package org.projectmvc.entity;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Optional;

/**
 * <p>Based class for all entity class.</p>
 *
 * <p>Note: We mark this class abstract since it would not make sense to create an instance of it, and
 * it is used to not create a corresponding IDao (Matcher in the AppConfig to ignore Abstract entity classes).</p>
 *
 * @param <I>
 */
public abstract class BaseEntity<I>{
	private I   id;

	//// timestamp
	private Long cid; // creator user id
	private ZonedDateTime ctime; // creation time
	private Long mid; // last modifier user time
	private ZonedDateTime mtime; // last modifier time

	public I getId() {
				return id;
		}
	public void setId(I id) {
		this.id = id;
	}



	// --------- Id accessor conveniences --------- //
	// to make getOrCreate simpler to write
	public I setIdAndReturnId(I id) {
		setId(id);
		return id;
	}
	public Optional<I> getOptionalId() {
		return Optional.ofNullable(id);
	}
	// --------- /Id accessor conveniences --------- //

	// --------- Timestamp --------- //
	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public ZonedDateTime getCtime() {
		return ctime;
	}

	public void setCtime(ZonedDateTime ctime) {
		this.ctime = ctime;
	}

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public ZonedDateTime getMtime() {
		return mtime;
	}

	public void setMtime(ZonedDateTime mtime) {
		this.mtime = mtime;
	}

	// --------- /Timestamp --------- //


}
